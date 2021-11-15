import dayjs from 'dayjs';

export interface IMessage {
  id?: string;
  receivedAt?: string;
  version?: number;
  newContent?: string | null;
  previousMessage?: IMessage | null;
}

export const defaultValue: Readonly<IMessage> = {};
